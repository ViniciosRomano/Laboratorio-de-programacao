# Laboratorio-de-programacao
Visualg, Java
#
intall java development: https://www.oracle.com/java/technologies/downloads/#jdk18-windows, JDK MSI INSTALLER install eclipse https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-03/R/eclipse-inst-jre-win64.exe




#
#include <Servo.h>

const byte SERVO1_PIN = 10;
const byte SERVO2_PIN = 11;
const byte ARMA_SENSOR_PIN = 12;
const int TEMPO_ARMA_ATIVADA = 13500;

//criando os objetos servos motors 
Servo Servo1;
Servo Servo2;

// pinos para os drivers dos motores
int IN1 = 3;
int IN2 = 5;
int IN3 = 6;
int IN4 = 9;

char entrada = ' ';
bool arma_ativada = false;
int contador_tempo = 0;

void setup(){
  Servo1.attach(SERVO1_PIN); 
  Servo2.attach(SERVO2_PIN);
  
  pinMode(IN1, OUTPUT);
  pinMode(IN2, OUTPUT);
  pinMode(IN3, OUTPUT);
  pinMode(IN4, OUTPUT);

  pinMode(ARMA_SENSOR_PIN, INPUT_PULLUP);
 
  Serial.begin(9600);
  Serial.println("Robo iniciado 2022");
  delay(500);
}
  
void loop(){
  if (digitalRead(ARMA_SENSOR_PIN) == LOW){ 
      if (contador_tempo == 0){
         Serial.println("Sensor Ativado! 15 segundos");
         arma_ativada = true;
        contador_tempo = TEMPO_ARMA_ATIVADA;
      }
    }
 
  if (arma_ativada == true){
    Servo1.write(120);
    Servo2.write(120);
  }else{
    Servo1.write(0);
    Servo2.write(0);
  }
  
  if (contador_tempo > 0){
    contador_tempo = contador_tempo - 1;
    if (contador_tempo == 0){
      Serial.println("Arma Desativada!!");
      arma_ativada = false;
    }
  }
   
  if (Serial.available() > 0) {
    entrada = Serial.read();
    Serial.println(entrada);
  }
  
  switch(entrada){
    case 'w': // frente
      //Gira o Motor A
       digitalWrite(IN1, HIGH);
       digitalWrite(IN2, LOW);
       //Gira o Motor B
       digitalWrite(IN3, HIGH);
       digitalWrite(IN4, LOW);
       break;
       
    case 's': // frente
      //Gira o Motor A
       digitalWrite(IN1, LOW);
       digitalWrite(IN2, HIGH);
       //Gira o Motor B
       digitalWrite(IN3, LOW);
       digitalWrite(IN4, HIGH);
       break;

    case 'a': // esquerda
      //Gira o Motor A
       digitalWrite(IN1, LOW);
       digitalWrite(IN2, HIGH);
       //Gira o Motor B
       digitalWrite(IN3, HIGH);
       digitalWrite(IN4, LOW);
       break;

    case 'd': // direita
      //Gira o Motor A
       digitalWrite(IN1, HIGH);
       digitalWrite(IN2, LOW);
       //Gira o Motor B
       digitalWrite(IN3, LOW);
       digitalWrite(IN4, HIGH);
       break;

    case 'q': // parada
      //Gira o Motor A
       digitalWrite(IN1, LOW);
       digitalWrite(IN2, LOW);
       //Gira o Motor B
       digitalWrite(IN3, LOW);
       digitalWrite(IN4, LOW);
       break;
  }
  
  delay(1);
}

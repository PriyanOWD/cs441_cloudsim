# CS 441 HW1 - CloudSim
### Description: Create cloud simulators for evaluating executions of applications in cloud datacenters with different characteristics and deployment models.
#### Name: Priyan Sureshkumar
#### Net-ID: psures5@uic.edu

#
#
##### Driver Langauge:          Scala 2.13.1
##### CloudSim Language:        Java
##### Testing Framework:        ScalaTest
##### Building Framework:       SBT
##### Configuration Library:    Typesafe
- 5 simulation .conf files with names simulationX.conf where X [1,5]
##### Main Driver Class:        CloudSimulation in psures5_CS441_Proj1.scala

##### Required Libraries: Cloud2Sim, apache.commons.math3, typesafe.Config, slf4j, 

#### To Compile: sbt cleam compile *

##### To Run Simulations: sbt "run simulationX.conf"

##### To Run Tests(in test directory): sbt test
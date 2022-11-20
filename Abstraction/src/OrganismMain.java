abstract class Organism {

						void Sound() {}
						void Sense() {}
						}

class Human extends Organism {

void Sound() {System.out.println("Humans speaks languages");}

void Sense() {System.out.println("Humans have 6 senses");}

}

class Dog extends Organism {

void Sound() {System.out.println("Dog Barks");}

void Sense() {System.out.println("Dogs have 5 senses");}

}

class OrganismMain {

public static void main ( String args [ ] )

{
Organism h = new Human();
h.Sound();
h.Sense();
}}
publi class Animal{
	private Piel piel;
	private int tamano;
	private String color;
	private Ojos ojos;

	public String toString(){
		return "piel" + this.piel + "\nTamaño: " + this.tamano + "\nOjos: " + this.ojos;
	}

	public boolean equals(Object o){
		if (!(o instanceof Animal)){ //si el tipo de dato es del tipo pedido 
			return false;
		}
		Animal animalito = (Animal)o;
		return this.piel.equals(animalito.piel) && this.tamano==this.tamano && this.color.equals(animalito.color) && this.ojos.equals(animalito.ojos);
	}
} 
package classesEtObjets.seize;

import java.util.Scanner;


class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Commodity commodity = new Commodity();
		commodity.name = scanner.nextLine();
		commodity.price = scanner.nextInt();

		Purchase purchase = new Purchase();
		purchase.commodity = commodity;
		purchase.quantity = scanner.nextInt();

		purchase.show();
		commodity.price = scanner.nextInt();
		System.out.println();
		purchase.show();
	}
}


class Commodity {
	String name;
	int price;


	void show() {
		System.out.printf("Наименование товара: %s\n", name);
		System.out.printf("Цена товара: %d\n", price);
	}
}


class Purchase{
	Commodity commodity;
	int quantity;


	private int getCost() {
		return commodity.price * quantity;
	}


	public void show() {
		System.out.printf("Наименование товара: %s\n", commodity.name);
		System.out.printf("Цена товара: %d\n", commodity.price);
		System.out.printf("Количество: %d\n", quantity);
		System.out.printf("Стоимость покупки: %d\n", getCost());
	}
}

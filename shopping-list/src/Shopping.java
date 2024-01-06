import java.util.Scanner;

public class Shopping {
    public static void main(String[] args){
        System.out.println("Вас приветствует список покупок!");
        String[] shoppingList = new String[8];
        Scanner scanner = new Scanner(System.in);
        int productCount = 0;

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            String actionNumber = scanner.next();

            switch(actionNumber) {
                case "1":
                    System.out.println("Введите название товара:");
                    String productName = scanner.next();
                    boolean isExist = false;
                    if (productCount == 0) {
                        shoppingList[0] = productName;
                        System.out.println("Товар " + productName + " добавлен в список под номером " + (productCount + 1));
                        productCount++;
                    } else {
                        int i;
                        for (i = 0; i < productCount; i++) {
                            if (shoppingList[i].equals(productName)) {
                                isExist = true;
                                break;
                            } else {
                                isExist = false;
                            }
                        }
                        if (isExist) {
                            System.out.println("Такой товар уже есть в списке!");
                        } else {
                            shoppingList[i] = productName;
                            System.out.println("Товар " + productName + " добавлен в список под номером " + (productCount + 1));
                            productCount++;
                        }
                    }
                if(productCount > shoppingList.length-1){
                    String [] shoppingList_2 = new String[productCount+1];
                    for (int i = 0; i < shoppingList.length; i++) {
                        shoppingList_2[i] = shoppingList[i];
                    }
                    shoppingList = shoppingList_2;
                }
                    break;
                case "2":
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(i + 1 + ". " + shoppingList[i]);
                    }
                    if (productCount == 0) {
                        System.out.println("Список пуст!");
                } // показать список
                    break;
                case "3":
                    for(int i =0; i <= productCount; i++){
                        shoppingList[i] = null;
                    }
                    productCount = 0;
                    //shoppingList.clear();
                    System.out.println("Список пуст!");
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Неизвестная команда!");
                }
            }
        }
    }

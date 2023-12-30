import java.util.Objects;
import java.util.Scanner;
//import java.util.ArrayList;

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

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                String productName = scanner.next();
                boolean isExist = false;
                    for(int i = 0; i <= productCount; i++){
                        if(Objects.equals(shoppingList[i], productName)){
                            isExist = true;
                        } else {
                            isExist = false;
                            continue;
                        }
                    if(isExist) {
                        System.out.println("Такой товар уже есть в списке!");
                    } else {
                        shoppingList[productCount] = productName;
                        System.out.println("Товар " + productName + " добавлен в список под номером "+ (productCount +1));
                        productCount++;
                    }
                    if(productCount >7){
                        System.out.println("Список слишком большой, придётся отложить покупку до следующего раза");
                    }
                }
            } //добавить товар в список
            else if (actionNumber == 2){
                for(int i=0;i<productCount; i++){
                    System.out.println(i + 1 +". "+ shoppingList[i]);
                }
                if (productCount == 0){
                    System.out.println("Список пуст!");
                }
            } // показать список
            else if (actionNumber == 3){
                for(int i =0; i <= productCount; i++){
                    shoppingList[productCount] = null;
                }
                productCount = 0;
                System.out.println("Список пуст!");
            } // очистить список
            else if (actionNumber == 4) { // завершить работу
                break;
            } else {
                System.out.println("Неизвестная команда!");
            }

        }
    }
}

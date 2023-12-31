import java.util.Scanner;
import java.util.ArrayList;

public class Shopping {
    public static void main(String[] args){
        System.out.println("Вас приветствует список покупок!");
        //String[] shoppingList = new String[8];
        ArrayList <String> shoppingList = new ArrayList<>();
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
                System.out.println("Введите название товара:");
                String productName = scanner.next();
                boolean isExist = false;
                if(productCount == 0){ //проверяем что товара нет на 0 месте,то есть массив пустой
                    shoppingList.add(productName);
                    System.out.println("Товар " + productName + " добавлен в список под номером "+ (productCount +1));
                    productCount++;
                } else{
                    for(int i = 0; i < productCount;i++){ // проверяем что искомого товара нет в других местах массива
                        if(shoppingList.get(i).equals(productName)){
                            isExist = true;
                            break;
                        } else {
                            isExist = false;
                        }
                    }
                    //System.out.println(isExist);
                    if(isExist) {
                        System.out.println("Такой товар уже есть в списке!");
                    } else {
                        shoppingList.add(productName);
                        System.out.println("Товар " + productName + " добавлен в список под номером "+ (productCount +1));
                        productCount++;
                    }
                }
                /*if(productCount >7){
                    System.out.println("Список слишком большой, придётся отложить покупку до следующего раза");
                    shoppingList.add(productName); - остатки от первоначального решения с ограничением размера
                }*/
            } //добавить товар в список
            else if (actionNumber == 2){
                for(int i=0;i<productCount; i++){
                    System.out.println(i + 1 +". "+ shoppingList.get(i));
                }
                if (productCount == 0){
                    System.out.println("Список пуст!");
                }
            } // показать список
            else if (actionNumber == 3){
                /*for(int i =0; i <= productCount; i++){
                    shoppingList.set(i, null);  -  тут я запутался в размерах массива и решил пойти простым путём
                }*/
                productCount = 0;
                shoppingList.clear();
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

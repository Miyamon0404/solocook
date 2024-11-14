package solocook;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IngredientDatabase {
    private List<Ingredient> ingredients;

    public IngredientDatabase() {
        this.ingredients = new ArrayList<>();  // ArrayListで材料を管理
    }

    // 材料を追加
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    // すべての材料を取得
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    // 指定した名前の材料を検索
    public Ingredient findIngredient(String name) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                return ingredient;
            }
        }
        return null;
    }

    // 現在の材料リストを表示
    public void displayIngredients() {
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }
    
    // 消費期限順に材料をソートするメソッド
    public void sortIngredientsByExpirationDate() {
        ingredients.sort(Comparator.comparing(Ingredient::getExpirationDate));
    }
}

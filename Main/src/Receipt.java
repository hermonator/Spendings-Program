/**
 * Created by jc259420 on 20/12/2016.
 */
public class Receipt {
    // Details of the receipt
    private final String[] CATEGORIES = {"Groceries", "Tech", "Medicines", "Furniture", "Gifts", "Work Expense"};
    private String description;
    private float cost;
    private boolean claimable;
    private int year;
    private String primaryCategory,secondaryCategory;

    // Setter and getter methods


    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setClaimable(boolean claimable) {
        this.claimable = claimable;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSecondaryCategory(String secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
    }


    public float getCost() {
        return cost;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public String getPrimaryCategory() {
        return primaryCategory;
    }

    public String getSecondaryCategory() {
        return secondaryCategory;
    }

    public String[] getCATEGORIES() {
        return CATEGORIES;
    }

    public boolean isClaimable() {
        return claimable;
    }
}

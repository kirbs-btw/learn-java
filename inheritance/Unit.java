package inheritance;

class Data{
    int[] nums = { 1, 2, 3, 4 };


    public void display(){
        for (int i = 0; i < this.nums.length; i++){
            System.out.println(this.nums[i]);
        }
    }

    public String numbers(){
        String numsArr = "[";

        for (int i = 0; i < this.nums.length; i++){
            numsArr = numsArr + this.nums[i];

            if (i != this.nums.length -1){
                numsArr = numsArr + ", ";
            }
        }

        numsArr = numsArr + "]";
        return numsArr;

    }
}

class Unit extends Data{
    private String dataLabel = "People";

    public static void main(String[] args) {
        Unit myUnit = new Unit();

        System.out.println(myUnit.numbers() + " " + myUnit.dataLabel);
    }
}
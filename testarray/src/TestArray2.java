public class TestArray2 {

    public static void main(String[] args) {
        String[][] names = {
                {"Mr.", "Mrs.", "Ms."},
                {"b", "a"},
                {"Smith", "Jones"},
                {"banana", "Carotte"}

        };

        int nrOfCombos=1;
        for (int i=0; i<names.length; i++){
            nrOfCombos*=names[i].length;
        }
        System.out.println("nr of combos = " + nrOfCombos);

        for (int var1=0;var1<=nrOfCombos;var1++){

        }

        for (int pos=0; pos<= names.length; pos++){
            System.out.println("position is " + pos);
            String soFar="";

            for ( int i = 0 ; i < names[pos].length ; i++) {
                System.out.println("i is " + i);
                soFar = soFar +  " " + names[i][pos];
                System.out.println("soFar in loop " + soFar);
            }
             System.out.println(soFar);


        }

        //combos(0,names,"");

    }

    static void combos(int pos, String[][] array, String soFar) {
        if (pos == array.length) {
            System.out.println(soFar);
            return;
        }
        for (int i = 0 ; i < array[pos].length ; i++) {
            combos(pos+1, array, soFar +  " " + array[pos][i]);
        }
    }




}

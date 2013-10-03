
package com.example.testapp1;

// i like Light a lot, 
// seems to swap the default font on my phone with last typeface>

/*Questions

What is the initial capacity of the following string builder?

StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");

Consider the following string:

String hannah = "Did Hannah see bees? Hannah did.";

    What is the value displayed by the expression hannah.length()?

    What is the value returned by the method call hannah.charAt(12)?

    Write an expression that refers to the letter b in the string referred to by hannah.

How long is the string returned by the following expression? What is the string?

"Was it a car or a cat I saw?".substring(9, 12)

In the following program, called ComputeResult, what is the value of result after each numbered line executes?

public class ComputeResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

1   result.setCharAt(0, original.charAt(0));
2   result.setCharAt(1, original.charAt(original.length()-1));
3   result.insert(1, original.charAt(4));
4   result.append(original.substring(1,4));
5   result.insert(3, (original.substring(index, index+2) + " ")); 

        System.out.println(result);
    }
}

Exercises

Show two ways to concatenate the following two strings together to get the string "Hi, mom.":

String hi = "Hi, ";
String mom = "mom.";

Write a program that computes your initials from your full name and displays them.

An anagram is a word or a phrase made by transposing the letters of another word or phrase; for example, "parliament" is an anagram of "partial men," and "software" is an anagram of "swear oft." Write a program that figures out whether one string is an anagram of another string. The program should ignore white space and punctuation.

------------
http://fruzenshtein.com/exercise-2/
public String subStringSearch(String str) {
        StringBuilder result = new StringBuilder();

        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            char symbol = str.charAt(i);
            if (symbol == str.charAt(length - (i + 1))) {
                result.append(symbol);
            } else {
                break;
            }
        }
        return result.toString();
    }
    
    
    public String subStringSearch(String str) {
        StringBuilder endStr = new StringBuilder(str).reverse();
        String thisSubstr;
        for (int i = 0; i < length / 2; i++) {
            thisSubstr = str.subString(0,i);
            if (!thisSubstr.equals(endStr.toString().subString(0,i)) {
                break;
            }
        }
        return thisSubstr;
    }
    
    public String subStringSearch(String str) {
        StringBuilder endStr = new StringBuilder();

        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            String subStr = str.subString(0,i);
            endStr = str.subString(str.length-1,str.length-(1 + i));
            endStr.reverse();
            if (!subStr.equals(endStr.toString()) {
                break;
            }
        }
        return subStr;
    }
*/
import java.lang.reflect.Field;

import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // done after setting contentview, i've read required
        // first txt field is left default regular

        Typeface tf0 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Condensed.ttf");
        // Typeface tf =
        // Typeface.createFromAsset(getAssets(),"fonts/Roboto-Black.ttf");
        TextView tv0 = (TextView) findViewById(R.id.txt2);
        tv0.setTypeface(tf0);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Thin.ttf");
        // Typeface tf =
        // Typeface.createFromAsset(getAssets(),"fonts/Roboto-Light.ttf");
        // Typeface tf =
        // Typeface.createFromAsset(getAssets(),"fonts/Roboto-Condensed.ttf");
        // Typeface tf =
        // Typeface.createFromAsset(getAssets(),"fonts/Roboto-Black.ttf");
        TextView tv = (TextView) findViewById(R.id.txt3);
        tv.setTypeface(tf);

        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        TextView tv2 = (TextView) findViewById(R.id.txt4);
        tv2.setTypeface(tf2);

        String testStr = "Setec Astronomy";
        Log.d("XSX", "***name: " + testStr);
        testStr = testStr.toUpperCase();
        Log.d("XSX", "***name: " + testStr);

        char[] splitStrArr = testStr.toCharArray();
        // String[] splitStrArr = testStr.split(","); //
        Log.d("XSX", "***name: " + splitStrArr.length);

        StringBuilder testStrBldr = new StringBuilder();
        int[] thisIntArr = {
                7, 8, 3, 9, 4, 1, 0, 100, 14, 11, 6, 13, 5, 12, 10, 2
        };

        for (int i = 0; i < thisIntArr.length; i++) {
            // for (String thisChar : splitStrArr) { // enhanced for loop syntax
            Log.d("XSX", "***name: " + thisIntArr[i]);
            if (thisIntArr[i] == 100) {
                testStrBldr.append(" ");
            } else {
                testStrBldr.append(splitStrArr[thisIntArr[i]]);
            }

        }
        Log.d("XSX", "***name: " + testStrBldr.toString());
        Log.d("XSX", "***name: " + testStrBldr.reverse().toString());

        
        String thisStr = "abcdkuyodcba";
        StringBuilder sb = new StringBuilder(thisStr);
        Log.d("XSX", "***thisStr sb: " + sb.toString());
        

        thisStr = "Was it a car or a cat I saw?";
        Log.d("XSX", "***car: " + thisStr.substring(9, 12));

        Log.d("XSX", "***subStringSearch: " + subStringSearch("abcdkuyodcba"));
        // ------------- iterators section

        /*
         * String aColors[] =
         * getResources().getStringArray(R.array.colorsArray); // String[] names
         * = { "Chris", "Risner" }; for (String name : aColors) { // enhanced
         * for loop syntax Log.d("XSX", "***name: " + name); // Do something
         * with name } Log.d("XSX", "***name: " ); // Iterator it =
         * list.iterator(); for moving through a // while(it.hasNext()) int i =
         * 0; while ((i) < aColors.length) { Log.d("XSX", "***name: " +
         * aColors[i]); i++; } Log.d("XSX", "***name: " ); for (int j =
         * aColors.length - 1; j >= 0; j--) { Log.d("XSX", "***name: " +
         * aColors[j]); } Log.d("XSX", "***name: " ); Field[] aClassFields =
         * Build.class.getDeclaredFields(); for (Field name : aClassFields) { //
         * enhanced for loop syntax Log.d("XSX", "***name: " + name); // Do
         * something with name }
         */

    }
    
    public String subStringSearch(String str) {
        StringBuilder endStr = new StringBuilder(str).reverse();
        String returnSubstr = "";
        for (int i = 0; i < str.length() / 2; i++) {
            if (i > 0) returnSubstr = str.substring(0,i-1);
            if (!str.substring(0,i).equals(endStr.toString().substring(0,i))) {
                break;
            }
        }
        return returnSubstr;
    }

    /*public String subStringSearch(String str) {
        StringBuilder endStr = new StringBuilder();

        int sLength = str.length();
        String subStr = "";
        String subStr = "";
        for (int i = 0; i < sLength / 2; i++) {
            subStr = str.substring(0,i);
            endStr = str.substring(sLength-1,sLength-(1 + i));
            endStr.reverse();
            if (!subStr.equals(endStr.toString()) {
                break;
            }
        }
        return subStr;
    }*/
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}


/**
 * Write a description of class Size here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum Size
{
    // instance variables - replace the example below with your own

 SMALL(42, 46, "Pequeno",'S'),
 MEDIUM(47, 54, "Médio",'M'),
 LARGE(55, 62, "Grande",'L');
 private final String description;
 private final int minValue;
 private final int maxValue;

    private final char code;

 private Size(int minValue, int maxValue, String description, char code){
 this.description=description;
 this.minValue=minValue;
 this.maxValue=maxValue;
 this.code=code;
 }
 @Override
 public String toString() {
 return this.description;
 }
 public String getDescription() {
 return description;
 }
 public int getMinValue() {
 return minValue;
 }
 public int getMaxValue() {
 return maxValue;
 }
 public char getCode() {
 return code;
 }

}


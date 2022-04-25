package enumerators.ex1_weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay(){
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday(){
        return !isWeekDay();
    }

    public void whichIsGreater(Weekday day){
        if(this.compareTo(day) > 0){
            System.out.println(this + " jest nastepnikiem "+ day);
        }else if (this.compareTo(day) < 0){
            System.out.println(this + " jest poprzednikiem "+ day);
        }else{
            System.out.println(this + " jest tym samym co "+ day);
        }
    }

}


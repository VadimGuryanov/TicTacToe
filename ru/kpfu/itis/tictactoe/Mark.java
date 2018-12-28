package ru.kpfu.itis.tictactoe;

/**
 * purpose: Represents a mark (x or o)
 * @author Vadim Guryanov </gvadimmonstors@mail.ru>
 * @version 1.0
 */
public class Mark {
    private boolean mark;
    public Mark(boolean mark){
        this.mark = mark;
    }

    /**
     * getter method
     * @return whether mark is a cross or a zero
     */
    public boolean isCross(){
        return this.mark;
    }
    @Override
    public String toString() {
        if (mark) return "x";
        return "o";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark1 = (Mark) o;
        return mark == mark1.mark;
    }

    /**
     *
     * @param string - converting string
     * @return mark converted from a string
     *@throws MarkFormatException if string cannot be converted to a mark
     */
    public static Mark valueOf(String string) throws MarkFormatException{
        switch (string){
            case "x":
                return new Mark(true);
            case "х":
                return new Mark(true);
            case "o":
                return new Mark(false);
            case "о":
                return new Mark(false);
            default:
                throw new MarkFormatException("Argument string cannot be converted into mark.");
        }
    }
}

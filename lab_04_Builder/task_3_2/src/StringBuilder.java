public class StringBuilder {
    private String string="";
    public StringBuilder add(String string){
        this.string+=string;
        return this;
    }
    public StringBuilder addToPosition(String string, int position){
        if (position>=this.string.length()){
            return add(string);
        }
        this.string=this.string.substring(0,position)+string+this.string.substring(position);
        return this;
    }

    public String build() {
        return this.string;
    }
}

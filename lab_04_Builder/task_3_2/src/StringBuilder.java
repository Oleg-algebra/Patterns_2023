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
    public StringBuilder clear(){
        this.string="";
        return this;
    }
//    public StringBuilder replace(String oldString, String newString){
//        if(this.string.contains(oldString)){
//            this.string = this.string.replace(oldString, newString);
//        }
//        return this;
//    }
//    public StringBuilder delete_at_position(int position){
//        if(position<0 || position > this.string.length()-1){
//            return this;
//        }
//        this.string = this.string.substring(0,position)+this.string.substring(position+1);
//        return this;
//    }
//    public StringBuilder setString(String string) {
//        this.string = string;
//        return this;
//    }
//
//    public StringBuilder delete_subString(int start, int end){
//        if(start<0){
//            start=0;
//        }
//        if (end>this.string.length()) {
//            end = this.string.length();
//        }
//        this.string = this.string.substring(0,start)+
//                this.string.substring(end);
//        return this;
//    }

    public String build() {
        return string;
    }
}

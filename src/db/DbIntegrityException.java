package db;

public class DbIntegrityException extends RuntimeException {
    private  static final long serialVersionUID=1l;
    public DbIntegrityException(String msg){
        super(msg);
    }

}

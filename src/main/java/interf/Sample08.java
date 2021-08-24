package interf;

public class Sample08 {
    public static void main(String[] args){
        Database db1 = new OracleDatabase();
        db1.getConnection();
        System.out.println(db1.getDbInfo());
        Database db2 = new MsDatabase();
        System.out.println(db2.getDbInfo());
    }


}

interface Database{
    public void getConnection();
    public String getDbInfo();
}

class OracleDatabase implements Database {
    boolean conn = false;
    @Override
    public void getConnection() {
        this.conn = true;
    }

    @Override
    public String getDbInfo() {
        String ret = "";
        if(conn) ret = "오라클 접속";
        else ret = "오라클 미접속";
        return ret;
    }
}

class MsDatabase implements Database {
    boolean conn = false;
    @Override
    public void getConnection() {
        this.conn = true;
    }

    @Override
    public String getDbInfo() {
        String ret = "";
        if(conn) ret = "ms 접속";
        else ret = "ms 미접속";
        return ret;
    }
}

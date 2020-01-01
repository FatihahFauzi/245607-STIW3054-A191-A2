package A2_245607;

//import org.apache.poi.ss.formula.functions.T;


class Data {
    private String Login,URL,Type;
    private  String NumRespo, NumProject, NumFollower, NumFollowing;

    public Data( String URL) {
        this.URL = URL;

    }
    public Data(String login,String NumRespo,String NumFollower,String NumProject,String NumFollowing){
        this.Login=login;
        this.NumRespo=NumRespo;
        this.NumProject=NumProject;
        this.NumFollower=NumFollower;
        this.NumFollowing=NumFollowing;
    }
    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getNumRespo() {
        return NumRespo;
    }

    public void setNumRespo(String NumRespo) {
        this.NumRespo=NumRespo;
    }
    public String getNumFollower() {
        return NumFollower;
    }

    public void setNumFollower(String NumFollower) {
        this.NumFollower = NumFollower;
    }
    public String getNumFollowing() {
        return NumFollowing;
    }

    public void setNumFollowing(String NumFollowing) {
        this.NumFollowing = NumFollowing;
    }
    public void setNumProject(String NumProject) {
        this.NumProject=NumProject;
    }
    public String getNumProject() {
        return NumProject;
    }

}

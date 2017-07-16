package com.gradesolutions.propositum.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by GrupoUTP on 27/05/2017.
 */

public class DataService {
    private List<Advisor> advisors;
    private DataService service;

    public DataService()
    {
        advisors = new ArrayList<>();
        initAdvisors();
    }

    private void initAdvisors(){
        advisors.add(new Advisor("001","Ramon","Asesor Mundial","10","Disponible","Ing.Software"));
        advisors.add(new Advisor("002","Florinda","Asesor Mundial","15","Ocupado","Ing.Sistemas"));
        advisors.add(new Advisor("003","Chespirito","Asesor Mundial","20","Disponible","Ing.Mecatronica"));
    }
    public List<Advisor> getAdvisors() {
        return advisors;
    }

    public DataService setAdvisors(List<Advisor> advisors) {
        this.advisors = advisors;
        return this;
    }
    public boolean addAdvisor(Advisor advisor) {
        advisors.add(advisor);
        return true;
    }

}

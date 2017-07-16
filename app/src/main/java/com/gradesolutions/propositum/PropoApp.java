package com.gradesolutions.propositum;

import android.app.Application;

import com.gradesolutions.propositum.models.Advisor;
import com.gradesolutions.propositum.models.DataService;

import java.util.List;

/**
 * Created by William on 13/07/2017.
 */

public class PropoApp extends Application{
    private static PropoApp instance;
    private DataService service;

    public PropoApp() {
        super();
        instance = this;
    }

    public static PropoApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        service = new DataService();
    }
    public List<Advisor> getAdvisors() {
        return service.getAdvisors();
    }
    public boolean addAdvisor(Advisor advisor) {
        return service.addAdvisor(advisor);
    }
}

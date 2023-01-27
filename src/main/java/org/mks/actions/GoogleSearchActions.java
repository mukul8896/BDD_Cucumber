package org.mks.actions;

import org.json.simple.JSONObject;
import org.mks.runInitilization.DriverUtils;

public class GoogleSearchActions extends BaseActions{
    JSONObject testData;
    public GoogleSearchActions(){
        this.testData = (JSONObject) DriverUtils.getPageData().get(this.getClass().getSimpleName());
    }

    public void openGooglePage() {
        System.out.println(testData.get("data1").toString());
    }
}

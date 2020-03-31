package com.mutwakilmo.android.stayhomedev;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Mutwakil Mo on
 */
public class InternetDialogToast {

    public static void s(Context c, String message){
        // CALL getInternetStatus() function to check for internet and display error dialog
        if(new InternetDialog(c).getInternetStatus()){
            Toast.makeText(c, "MyNews Online\uD83D\uDCF6", Toast.LENGTH_SHORT).show();
        }
    }


}

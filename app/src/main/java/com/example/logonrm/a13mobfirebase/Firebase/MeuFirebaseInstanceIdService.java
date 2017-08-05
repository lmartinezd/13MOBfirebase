package com.example.logonrm.a13mobfirebase.Firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by logonrm on 05/08/2017.
 */

public class MeuFirebaseInstanceIdService extends FirebaseInstanceIdService{

    @Override
    public void onTokenRefresh(){
        super.onTokenRefresh();
        String firebaseToken = FirebaseInstanceId.getInstance().getToken();
        sendRegistrationToServer(firebaseToken);
    }

    private void sendRegistrationToServer(String token) {
        Log.d("Refreshed token: ",  token);
    }
}

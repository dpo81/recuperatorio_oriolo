package ar.edu.utn.fra.lab5.a1erparcial;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;

/**
 * Created by DPO on 2/11/2017.
 */

public class OnClickListener implements android.view.View.OnClickListener {
    Activity activity;

    public OnClickListener(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        if (ActivityCompat.checkSelfPermission(this.activity, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            Log.d("menu", "no se tiene permio para realizar llamadas");
        }
        else {
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:4444"));
            this.activity.startActivity(callIntent);
            Log.d("menu", "se llamò por telèfono");
        }

    }
}

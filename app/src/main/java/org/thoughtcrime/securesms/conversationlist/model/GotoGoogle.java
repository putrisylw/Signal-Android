package org.thoughtcrime.securesms.conversationlist.model;

import androidx.appcompat.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;


public class GotoGoogle extends View {
    String packageName = "org.thoughtcrime.securesms";

    public GotoGoogle(Context context){
        super(context);
    }

    public AlertDialog.Builder buildRemoteTranslateConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        builder.setTitle("Go to Google");
        builder.setMessage("Do you want to go to Google?")
                .setCancelable(true)
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getContext().startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://google.com")));
                    }
                })
                .setNegativeButton("Not Now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        return builder;
    }
}

package com.suchagit.android2cloud.errors;

import com.secondbit.debug2cloud.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class OAuthActivityNullUriDialogFragment extends DialogFragment {
	
    public static OAuthActivityNullUriDialogFragment newInstance() {
        OAuthActivityNullUriDialogFragment frag = new OAuthActivityNullUriDialogFragment();
        return frag;
    }
    
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int title = R.string.default_error_title;
        int body = R.string.oauthactivity_null_uri_error;
        int yesButton = R.string.default_error_ok;

        return new AlertDialog.Builder(getActivity())
    		.setCancelable(false)
            .setTitle(title)
            .setMessage(body)
            .setPositiveButton(yesButton,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    	dialog.cancel();
                    	getActivity().finish();
                    }
                }
            )
            .create();
    }
}
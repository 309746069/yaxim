package org.yaxim.androidclient.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import org.yaxim.androidclient.data.ChatRoomHelper;
import org.yaxim.androidclient.R;

public class ConfirmDialog {

	public static void show(Context context, int title_id,
			String message, final String jid, final Ok ok) {
		new AlertDialog.Builder(context)
			.setTitle(title_id)
			.setMessage(message)
			.setPositiveButton(android.R.string.yes,
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							ok.ok(jid);
						}
					})
			.setNegativeButton(android.R.string.no, null)
			.create().show();
	}

	public interface Ok {
		public void ok(final String jid);
	}
}

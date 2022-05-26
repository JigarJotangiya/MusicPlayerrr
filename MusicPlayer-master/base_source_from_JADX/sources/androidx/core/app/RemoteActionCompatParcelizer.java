package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1164b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1164b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2542a = (IconCompat) bVar.mo6173v(remoteActionCompat.f2542a, 1);
        remoteActionCompat.f2543b = bVar.mo6163l(remoteActionCompat.f2543b, 2);
        remoteActionCompat.f2544c = bVar.mo6163l(remoteActionCompat.f2544c, 3);
        remoteActionCompat.f2545d = (PendingIntent) bVar.mo6169r(remoteActionCompat.f2545d, 4);
        remoteActionCompat.f2546e = bVar.mo6159h(remoteActionCompat.f2546e, 5);
        remoteActionCompat.f2547f = bVar.mo6159h(remoteActionCompat.f2547f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1164b bVar) {
        bVar.mo6175x(false, false);
        bVar.mo6154M(remoteActionCompat.f2542a, 1);
        bVar.mo6145D(remoteActionCompat.f2543b, 2);
        bVar.mo6145D(remoteActionCompat.f2544c, 3);
        bVar.mo6149H(remoteActionCompat.f2545d, 4);
        bVar.mo6177z(remoteActionCompat.f2546e, 5);
        bVar.mo6177z(remoteActionCompat.f2547f, 6);
    }
}

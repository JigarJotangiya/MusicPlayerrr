package androidx.media;

import android.media.session.MediaSessionManager;

/* renamed from: androidx.media.d */
/* compiled from: MediaSessionManagerImplApi28 */
final class C0768d extends C0769e {
    C0768d(String str, int i, int i2) {
        super(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* renamed from: a */
    static String m4426a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }

    C0768d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }
}

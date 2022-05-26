package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p001v4.app.C0001a;

public abstract class NotificationCompatSideChannelService extends Service {

    /* renamed from: androidx.core.app.NotificationCompatSideChannelService$a */
    private class C0465a extends C0001a.C0002a {
        C0465a() {
        }

        /* renamed from: W3 */
        public void mo1W3(String str, int i, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.mo3150c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3148a(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: c2 */
        public void mo2c2(String str) {
            NotificationCompatSideChannelService.this.mo3150c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3149b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: r6 */
        public void mo3r6(String str, int i, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.mo3150c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3151d(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo3148a(String str, int i, String str2);

    /* renamed from: b */
    public abstract void mo3149b(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3150c(int i, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            if (!packagesForUid[i2].equals(str)) {
                i2++;
            } else {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    /* renamed from: d */
    public abstract void mo3151d(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL") || Build.VERSION.SDK_INT > 19) {
            return null;
        }
        return new C0465a();
    }
}

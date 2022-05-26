package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p079d.p080a.p081a.C3392a;
import p079d.p080a.p081a.C3398c;

public class PostMessageService extends Service {

    /* renamed from: g */
    private C3398c.C3399a f1481g = new C0337a(this);

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    class C0337a extends C3398c.C3399a {
        C0337a(PostMessageService postMessageService) {
        }

        /* renamed from: O2 */
        public void mo2256O2(C3392a aVar, Bundle bundle) throws RemoteException {
            aVar.mo2267m6(bundle);
        }

        /* renamed from: x3 */
        public void mo2257x3(C3392a aVar, String str, Bundle bundle) throws RemoteException {
            aVar.mo2265e6(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1481g;
    }
}

package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0961i0;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: g */
    int f4069g = 0;

    /* renamed from: h */
    final HashMap<Integer, String> f4070h = new HashMap<>();

    /* renamed from: i */
    final RemoteCallbackList<C0957h0> f4071i = new C0920a();

    /* renamed from: j */
    private final C0961i0.C0962a f4072j = new C0921b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class C0920a extends RemoteCallbackList<C0957h0> {
        C0920a() {
        }

        /* renamed from: a */
        public void onCallbackDied(C0957h0 h0Var, Object obj) {
            MultiInstanceInvalidationService.this.f4070h.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class C0921b extends C0961i0.C0962a {
        C0921b() {
        }

        /* renamed from: I6 */
        public void mo5436I6(C0957h0 h0Var, int i) {
            synchronized (MultiInstanceInvalidationService.this.f4071i) {
                MultiInstanceInvalidationService.this.f4071i.unregister(h0Var);
                MultiInstanceInvalidationService.this.f4070h.remove(Integer.valueOf(i));
            }
        }

        /* renamed from: h2 */
        public int mo5437h2(C0957h0 h0Var, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4071i) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f4069g + 1;
                multiInstanceInvalidationService.f4069g = i;
                if (multiInstanceInvalidationService.f4071i.register(h0Var, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f4070h.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4069g--;
                return 0;
            }
        }

        /* renamed from: h6 */
        public void mo5438h6(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4071i) {
                String str = MultiInstanceInvalidationService.this.f4070h.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f4071i.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f4071i.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f4070h.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f4071i.getBroadcastItem(i2).mo5481C1(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f4071i.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f4071i.finishBroadcast();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f4072j;
    }
}

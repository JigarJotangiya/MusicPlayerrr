package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3279h;

/* renamed from: com.google.android.gms.common.internal.a */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3252a extends C3279h.C3280a {
    @RecentlyNullable
    /* renamed from: K0 */
    public static Account m14088K0(@RecentlyNonNull C3279h hVar) {
        Account account = null;
        if (hVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = hVar.mo11843a();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}

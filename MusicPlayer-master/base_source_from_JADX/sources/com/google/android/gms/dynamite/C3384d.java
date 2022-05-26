package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3384d implements DynamiteModule.C3380b {
    C3384d() {
    }

    /* renamed from: a */
    public final C3389i mo11999a(Context context, String str, C3388h hVar) throws DynamiteModule.C3379a {
        C3389i iVar = new C3389i();
        int a = hVar.mo12002a(context, str, true);
        iVar.f10806b = a;
        if (a != 0) {
            iVar.f10807c = 1;
        } else {
            int b = hVar.mo12003b(context, str);
            iVar.f10805a = b;
            if (b != 0) {
                iVar.f10807c = -1;
            }
        }
        return iVar;
    }
}

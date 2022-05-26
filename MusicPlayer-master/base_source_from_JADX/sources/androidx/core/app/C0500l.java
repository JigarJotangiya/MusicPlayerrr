package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* renamed from: androidx.core.app.l */
/* compiled from: RemoteInput */
public final class C0500l {
    /* renamed from: a */
    static RemoteInput m3121a(C0500l lVar) {
        Set<String> d;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(lVar.mo3248i()).setLabel(lVar.mo3247h()).setChoices(lVar.mo3244e()).setAllowFreeFormInput(lVar.mo3242c()).addExtras(lVar.mo3246g());
        if (Build.VERSION.SDK_INT >= 26 && (d = lVar.mo3243d()) != null) {
            for (String allowDataType : d) {
                addExtras.setAllowDataType(allowDataType, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(lVar.mo3245f());
        }
        return addExtras.build();
    }

    /* renamed from: b */
    static RemoteInput[] m3122b(C0500l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            remoteInputArr[i] = m3121a(lVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: c */
    public boolean mo3242c() {
        throw null;
    }

    /* renamed from: d */
    public Set<String> mo3243d() {
        throw null;
    }

    /* renamed from: e */
    public CharSequence[] mo3244e() {
        throw null;
    }

    /* renamed from: f */
    public int mo3245f() {
        throw null;
    }

    /* renamed from: g */
    public Bundle mo3246g() {
        throw null;
    }

    /* renamed from: h */
    public CharSequence mo3247h() {
        throw null;
    }

    /* renamed from: i */
    public String mo3248i() {
        throw null;
    }
}

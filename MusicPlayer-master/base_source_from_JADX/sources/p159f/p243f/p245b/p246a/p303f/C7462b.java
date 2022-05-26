package p159f.p243f.p245b.p246a.p303f;

import androidx.annotation.RecentlyNonNull;

/* renamed from: f.f.b.a.f.b */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
public final class C7462b extends IllegalStateException {
    private C7462b(String str, Throwable th) {
        super(str, th);
    }

    @RecentlyNonNull
    /* renamed from: of */
    public static IllegalStateException m41868of(@RecentlyNonNull C7470h<?> hVar) {
        String str;
        if (!hVar.mo28342l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception i = hVar.mo28339i();
        if (i != null) {
            str = "failure";
        } else if (hVar.mo28343m()) {
            String valueOf = String.valueOf(hVar.mo28340j());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("result ");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            str = hVar.mo28341k() ? "cancellation" : "unknown issue";
        }
        String valueOf2 = String.valueOf(str);
        return new C7462b(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), i);
    }
}

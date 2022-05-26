package com.bumptech.glide.load.p030n;

import android.util.Log;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1786g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.bumptech.glide.load.n.q */
/* compiled from: GlideException */
public final class C1895q extends Exception {

    /* renamed from: g */
    private static final StackTraceElement[] f6844g = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private C1744a dataSource;
    private String detailMessage;
    private Exception exception;
    private C1786g key;

    public C1895q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: a */
    private void m9176a(Throwable th, List<Throwable> list) {
        if (th instanceof C1895q) {
            for (Throwable a : ((C1895q) th).getCauses()) {
                m9176a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m9177b(List<Throwable> list, Appendable appendable) {
        try {
            m9178c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m9178c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof C1895q) {
                ((C1895q) th).m9180e(appendable);
            } else {
                m9179d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m9179d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: e */
    private void m9180e(Appendable appendable) {
        m9179d(this, appendable);
        m9177b(getCauses(), new C1896a(appendable));
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        Class<?> cls = this.dataClass;
        String str3 = BuildConfig.FLAVOR;
        if (cls != null) {
            str = ", " + this.dataClass;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.dataSource != null) {
            str2 = ", " + this.dataSource;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.key != null) {
            str3 = ", " + this.key;
        }
        sb.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" root causes:");
        }
        for (Throwable next : rootCauses) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        m9176a(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), rootCauses.get(i));
            i = i2;
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* access modifiers changed from: package-private */
    public void setLoggingDetails(C1786g gVar, C1744a aVar) {
        setLoggingDetails(gVar, aVar, (Class<?>) null);
    }

    public void setOrigin(Exception exc) {
        this.exception = exc;
    }

    public C1895q(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        m9180e(printStream);
    }

    /* access modifiers changed from: package-private */
    public void setLoggingDetails(C1786g gVar, C1744a aVar, Class<?> cls) {
        this.key = gVar;
        this.dataSource = aVar;
        this.dataClass = cls;
    }

    public C1895q(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f6844g);
        this.causes = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        m9180e(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.n.q$a */
    /* compiled from: GlideException */
    private static final class C1896a implements Appendable {

        /* renamed from: g */
        private final Appendable f6845g;

        /* renamed from: h */
        private boolean f6846h = true;

        C1896a(Appendable appendable) {
            this.f6845g = appendable;
        }

        /* renamed from: a */
        private CharSequence m9181a(CharSequence charSequence) {
            return charSequence == null ? BuildConfig.FLAVOR : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f6846h) {
                this.f6846h = false;
                this.f6845g.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f6846h = z;
            this.f6845g.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = m9181a(charSequence);
            append(a, 0, a.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m9181a(charSequence);
            boolean z = false;
            if (this.f6846h) {
                this.f6846h = false;
                this.f6845g.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f6846h = z;
            this.f6845g.append(a, i, i2);
            return this;
        }
    }
}

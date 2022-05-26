package p159f.p237d.p238a;

import java.util.Arrays;

/* renamed from: f.d.a.b */
/* compiled from: MissingLibraryException */
public class C4824b extends RuntimeException {
    public C4824b(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}

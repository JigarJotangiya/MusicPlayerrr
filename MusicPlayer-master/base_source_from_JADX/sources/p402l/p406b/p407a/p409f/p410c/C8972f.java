package p402l.p406b.p407a.p409f.p410c;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import p402l.p406b.p407a.p409f.p412e.C9014c;
import p402l.p406b.p425b.C9118b;

/* renamed from: l.b.a.f.c.f */
/* compiled from: ContainerType */
public enum C8972f {
    CONTENT_BRANDING(C8978l.f35394f, 32, false, false, false, false),
    CONTENT_DESCRIPTION(C8978l.f35396h, 16, false, false, false, false),
    EXTENDED_CONTENT(C8978l.f35398j, 16, false, false, false, false),
    METADATA_LIBRARY_OBJECT(C8978l.f35404p, 32, true, true, true, true),
    METADATA_OBJECT(C8978l.f35403o, 16, false, true, false, true);
    
    private final C8978l containerGUID;
    private final boolean guidEnabled;
    private final boolean languageEnabled;
    private final BigInteger maximumDataLength;
    private final boolean multiValued;
    private final long perfMaxDataLen;
    private final boolean streamEnabled;

    private C8972f(C8978l lVar, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.containerGUID = lVar;
        BigInteger subtract = BigInteger.valueOf(2).pow(i).subtract(BigInteger.ONE);
        this.maximumDataLength = subtract;
        if (subtract.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
            this.perfMaxDataLen = subtract.longValue();
        } else {
            this.perfMaxDataLen = -1;
        }
        this.guidEnabled = z;
        this.streamEnabled = z2;
        this.languageEnabled = z3;
        this.multiValued = z4;
    }

    public static boolean areInCorrectOrder(C8972f fVar, C8972f fVar2) {
        List asList = Arrays.asList(getOrdered());
        return asList.indexOf(fVar) <= asList.indexOf(fVar2);
    }

    public static C8972f[] getOrdered() {
        return new C8972f[]{CONTENT_DESCRIPTION, CONTENT_BRANDING, EXTENDED_CONTENT, METADATA_OBJECT, METADATA_LIBRARY_OBJECT};
    }

    public void assertConstraints(String str, byte[] bArr, int i, int i2, int i3) {
        RuntimeException checkConstraints = checkConstraints(str, bArr, i, i2, i3);
        if (checkConstraints != null) {
            throw checkConstraints;
        }
    }

    public RuntimeException checkConstraints(String str, byte[] bArr, int i, int i2, int i3) {
        IllegalArgumentException illegalArgumentException;
        if (str == null || bArr == null) {
            illegalArgumentException = new IllegalArgumentException("Arguments must not be null.");
        } else {
            illegalArgumentException = !C9014c.m48173g(str) ? new IllegalArgumentException(C9118b.WMA_LENGTH_OF_STRING_IS_TOO_LARGE.getMsg(Integer.valueOf(str.length()))) : null;
        }
        if (illegalArgumentException == null && !isWithinValueRange((long) bArr.length)) {
            illegalArgumentException = new IllegalArgumentException(C9118b.WMA_LENGTH_OF_DATA_IS_TOO_LARGE.getMsg(Integer.valueOf(bArr.length), getMaximumDataLength(), getContainerGUID().mo31376d()));
        }
        String str2 = "0";
        if (illegalArgumentException == null && (i2 < 0 || i2 > 127 || (!isStreamNumberEnabled() && i2 != 0))) {
            illegalArgumentException = new IllegalArgumentException(C9118b.WMA_INVALID_STREAM_REFERNCE.getMsg(Integer.valueOf(i2), isStreamNumberEnabled() ? "0 to 127" : str2, getContainerGUID().mo31376d()));
        }
        if (illegalArgumentException == null && i == 6 && !isGuidEnabled()) {
            illegalArgumentException = new IllegalArgumentException(C9118b.WMA_INVALID_GUID_USE.getMsg(getContainerGUID().mo31376d()));
        }
        if (illegalArgumentException == null && ((i3 != 0 && !isLanguageEnabled()) || i3 < 0 || i3 >= 127)) {
            if (isStreamNumberEnabled()) {
                str2 = "0 to 126";
            }
            illegalArgumentException = new IllegalArgumentException(C9118b.WMA_INVALID_LANGUAGE_USE.getMsg(Integer.valueOf(i3), getContainerGUID().mo31376d(), str2));
        }
        return (illegalArgumentException == null && this == CONTENT_DESCRIPTION && i != 0) ? new IllegalArgumentException(C9118b.WMA_ONLY_STRING_IN_CD.getMsg()) : illegalArgumentException;
    }

    public C8978l getContainerGUID() {
        return this.containerGUID;
    }

    public BigInteger getMaximumDataLength() {
        return this.maximumDataLength;
    }

    public boolean isGuidEnabled() {
        return this.guidEnabled;
    }

    public boolean isLanguageEnabled() {
        return this.languageEnabled;
    }

    public boolean isMultiValued() {
        return this.multiValued;
    }

    public boolean isStreamNumberEnabled() {
        return this.streamEnabled;
    }

    public boolean isWithinValueRange(long j) {
        long j2 = this.perfMaxDataLen;
        return (j2 == -1 || j2 >= j) && j >= 0;
    }
}

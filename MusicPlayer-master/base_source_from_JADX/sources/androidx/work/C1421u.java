package androidx.work;

/* renamed from: androidx.work.u */
/* compiled from: WorkInfo */
public enum C1421u {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean isFinished() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}

package ru.bamlukanov.leetcodealgo.firstbadversion;

/**
 * <a href="https://leetcode.com/problems/first-bad-version">leetcode</a>
 */
public class FirstBadVersion {
    private final VersionControl versionControl;

    public FirstBadVersion(VersionControl versionControl) {
        this.versionControl = versionControl;
    }

    public int firstBadVersion(int n) {
        int begin = 1;
        int end = n - 1;
        while (begin <= end) {
            int middle = (begin + end) >>> 1;
            if (isBadVersion(middle)) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        return begin;
    }


    private boolean isBadVersion(int version) {
        return versionControl.isBadVersion(version);
    }
}

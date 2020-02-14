package chapter5.projects;

/**
 * A lock can be opened by setting the dial three times correctly.
 * @author LanXue
 * @date 2020-02-13 22:20
 */
public class CombinationLock {

    private String password;
    private String myCombination;
    private boolean state;

    public CombinationLock(String password) {
        this.password = password;
        state = false;
        myCombination = "";
    }

    /**
     * Sets the dial with the given letter.
     * @param letter the given letter
     */
    public void setDial(String letter) {
        myCombination += letter;
    }

    /**
     * Tests whether the lock has been opened.
     */
    public void unlock() {
        if (myCombination.length() <= 3) {
            if (myCombination.equals(password)) {
                state = true;
            }
        } else {
            myCombination = myCombination.substring(myCombination.length() - 3, myCombination.length());
            if (myCombination.equals(password)) {
                state = true;
            }
        }
    }

    /**
     * Returns the result of opening the lock.
     * @return the result
     */
    public boolean isOpen() {
        return state;
    }

    /**
     * Closes the lock and the combination the user set need is cleared.
     */
    public void close() {
        myCombination = "";
        state = false;
    }
}

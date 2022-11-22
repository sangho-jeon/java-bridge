package bridge;

import bridge.Util.COMMAND_CONSTANTS;

import java.util.List;
import java.util.Objects;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private int index = 0;

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public COMMAND_CONSTANTS move(String command, List<String> bridge) {
        if (Objects.equals(bridge.get(index), command)) {
            index++;
            COMMAND_CONSTANTS.CORRECT.setValue(index);
            return COMMAND_CONSTANTS.CORRECT;
        }
        return COMMAND_CONSTANTS.WRONG;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
        index = 0;
        COMMAND_CONSTANTS.CORRECT.setValue(index);
    }
}

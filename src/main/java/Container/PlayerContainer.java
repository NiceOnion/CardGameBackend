package Container;

import DataLayer.PlayerDTO;
import Interface.IPlayerContainer;

public class PlayerContainer {

    private final IPlayerContainer iPlayerContainer;

    public PlayerContainer(IPlayerContainer iPlayerContainer){
        this.iPlayerContainer = iPlayerContainer;
    }

    public PlayerDTO GetAccount(PlayerDTO playerDTO){
        return iPlayerContainer.GetAccount(playerDTO);
    }
}

import java.util.HashMap;
import java.util.Map;

class Remote {
    Map<Integer, DeviceCommand> buttons = new HashMap<>();  // 5�ӫ��s�A�C�ӫ��s������@�ӯS�w���]��
    
    void addDevice(int buttonId, DeviceCommand deviceCommand) {
        buttons.put(buttonId, deviceCommand);
    }
    
    void buttonClicked(int buttonId) {
        DeviceCommand deviceCommand = buttons.get(buttonId);
        if (deviceCommand != null) {
            deviceCommand.execute();
        }
    }
    
    void pressAllButtons() {
        for (DeviceCommand deviceCommand : buttons.values()) {
            deviceCommand.execute();
        }
    }
  }
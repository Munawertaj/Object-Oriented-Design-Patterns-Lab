public class Building {
        public static void main(String[] args) {

                Housing building = new Housing("123 Street");
                Housing floor1 = new Housing("123 Street - FirstFloor");

                int firstFloor = building.addStructure(floor1);

                Room washroom1m = new Room("FirstFloor Men's Washroom");
                Room washroom1w = new Room("FirstFloor Women's Washroom");
                Room common1 = new Room("FirstFloor Common Area");

                int firstMens = floor1.addStructure(washroom1m);
                int firstWomans = floor1.addStructure(washroom1w);
                int firstCommon = floor1.addStructure(common1);

                building.enter();

                Housing currentFloor = (Housing) building.getStructure(firstFloor);
                currentFloor.enter();


                Room currentRoom = (Room) currentFloor.getStructure(firstMens);
                currentRoom.enter();

                currentRoom.location();
                currentRoom.exit();

                currentRoom = (Room) currentFloor.getStructure(firstWomans);
                currentRoom.enter();

                currentRoom.location();
                currentRoom.exit();

                currentRoom = (Room) currentFloor.getStructure(firstCommon);
                currentRoom.enter();

                currentRoom.location();
                currentRoom.exit();

                building.exit();
        }
}
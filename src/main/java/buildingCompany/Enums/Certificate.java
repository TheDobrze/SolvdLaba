package buildingCompany.Enums;

public enum Certificate {
    FORKLIFT {
        @Override
        public String describe() {
            return "allows too operate forklifts";
        }
    },
    WORKING_AT_HEIGHTS {
        @Override
        public String describe() {
            return "allows too work on heights";
        }
    },
    WELDING {
        @Override
        public String describe() {
            return "allows too weld";
        }
    };

    public abstract String describe();

}

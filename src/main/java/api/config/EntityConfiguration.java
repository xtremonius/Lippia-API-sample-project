package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    USER_LOGGED {
        @Override
        public Class<?> getEntityService() { return UserloggedService.class; }

    },
    TIME_ENTRIES_ON_WORKSPACE {
        @Override
        public Class<?> getEntityService() { return TimeEntriesService.class; }

    },
    ADD_TIME_ENTRY_TO_WORKSPACE {
        @Override
        public Class<?> getEntityService() { return TimeEntriesService.class; }

    },
    UPDATE_TIME_ENTRY_TO_WORKSPACE {
        @Override
        public Class<?> getEntityService() { return TimeEntriesService.class; }

    },
    DELETE_TIME_ENTRY_FROM_WORKSPACE {
        @Override
        public Class<?> getEntityService() { return TimeEntriesService.class; }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    WORKSPACE_SIN_PARAMETRO {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceSinParametroService.class;
        }
    },
    WORKSPACE_ERROR {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceErrorService.class;
        }
    },
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },
    PROJECT_MODIFICAR {
        @Override
        public Class<?> getEntityService() {
            return ProjectModificarService.class;
        }
    },
    PROJECT_ERROR {
        @Override
        public Class<?> getEntityService() {
            return ProjectErrorService.class;
        }
    };

    public abstract Class<?> getEntityService();
}

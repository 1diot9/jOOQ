CREATE TABLE jooq_migration_history (
  id                  BIGINT       NOT NULL IDENTITY,
  migrated_at         TIMESTAMP    NOT NULL,
  migrated_from       VARCHAR(255) NOT NULL,
  migrated_to         VARCHAR(255) NOT NULL,
  migrated_to_message CLOB         NOT NULL,
  migrated_to_tags    CLOB         NOT NULL,
  migration_time      BIGINT           NULL,
  client_user_name    VARCHAR(255)     NULL,
  client_host_name    VARCHAR(255)     NULL,
  jooq_version        VARCHAR(50)  NOT NULL,
  sql                 CLOB             NULL,
  sql_count           INT          NOT NULL,
  status              VARCHAR(10)  NOT NULL,
  status_message      CLOB             NULL,
  resolution          VARCHAR(10)      NULL,
  resolution_message  CLOB             NULL,
  
  CONSTRAINT jooq_migr_hist_pk   PRIMARY KEY (id),
  CONSTRAINT jooq_migr_hist_chk1 CHECK (status IN ('STARTING', 'REVERTING', 'MIGRATING', 'SUCCESS', 'FAILURE')),
  CONSTRAINT jooq_migr_hist_chk2 CHECK (resolution IN ('OPEN', 'RESOLVED', 'IGNORED'))
);

COMMENT ON TABLE  jooq_migration_history                     IS 'The migration history of jOOQ Migrations.';
COMMENT ON COLUMN jooq_migration_history.id                  IS 'The database version ID.';
COMMENT ON COLUMN jooq_migration_history.migrated_at         IS 'The date/time when the database version was migrated to.';
COMMENT ON COLUMN jooq_migration_history.migrated_from       IS 'The previous database version ID.';
COMMENT ON COLUMN jooq_migration_history.migrated_to         IS 'The current database version ID.';
COMMENT ON COLUMN jooq_migration_history.migrated_to_message IS 'A message associated with the migration execution.';
COMMENT ON COLUMN jooq_migration_history.migrated_to_tags    IS 'The current database version tags, if any, in JSON array format.';
COMMENT ON COLUMN jooq_migration_history.migration_time      IS 'The time in milliseconds it took to migrate to this database version.';
COMMENT ON COLUMN jooq_migration_history.client_user_name    IS 'The client user name that was running the migration.';
COMMENT ON COLUMN jooq_migration_history.client_host_name    IS 'The client host name that was running the migration.';
COMMENT ON COLUMN jooq_migration_history.jooq_version        IS 'The jOOQ version used to migrate to this database version.';
COMMENT ON COLUMN jooq_migration_history.sql                 IS 'The SQL statements that were run to install this database version.';
COMMENT ON COLUMN jooq_migration_history.sql_count           IS 'The number of SQL statements that were run to install this database version.';
COMMENT ON COLUMN jooq_migration_history.status              IS 'The database version installation status.';
COMMENT ON COLUMN jooq_migration_history.status_message      IS 'Any info or error message explaining the status.';
COMMENT ON COLUMN jooq_migration_history.resolution          IS 'The error resolution, if any.';
COMMENT ON COLUMN jooq_migration_history.resolution_message  IS 'Any info or error message explaining the resolution.';
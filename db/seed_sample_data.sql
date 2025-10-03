-- Referees
INSERT INTO referee (name, level) VALUES ('Alice Johnson', 8);
INSERT INTO referee (name, level) VALUES ('Brian Lee', 9);
INSERT INTO referee (name, level) VALUES ('Carlos Martinez', 11);

-- Availability
INSERT INTO availability (referee_id, start_utc, end_utc)
VALUES (1, '2025-10-03T14:00:00Z', '2025-10-03T18:00:00Z');
INSERT INTO availability (referee_id, start_utc, end_utc)
VALUES (2, '2025-10-03T15:00:00Z', '2025-10-03T20:00:00Z');
INSERT INTO availability (referee_id, start_utc, end_utc)
VALUES (3, '2025-10-03T13:00:00Z', '2025-10-03T17:00:00Z');

-- Matches
INSERT INTO match (date_utc, home_team, away_team, required_level)
VALUES ('2025-10-03T15:00:00Z', 'Tigers U12', 'Lions U12', 1);
INSERT INTO match (date_utc, home_team, away_team, required_level)
VALUES ('2025-10-03T16:30:00Z', 'Wolves U14', 'Hawks U14', 2);

-- Assignments (empty at start — will be filled by your program)

-- Reports (empty at start — will be filled after matches)

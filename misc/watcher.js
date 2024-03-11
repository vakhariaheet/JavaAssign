const fs = require('fs');
const { exec } = require('child_process');

const getCommand = (file) => {
	return `javac ${file} && appletviewer ${file}`;
};

console.log(`Watching for file changes on ${__dirname}/../`);
fs.watch(__dirname, (event, filename) => {
	console.log('event is: ' + event);
	if (filename && filename.endsWith('.java')) {
		const command = getCommand(filename);
		childProcess = exec(command, (error, stdout, stderr) => {
			if (error) {
				console.error(`Execution failed: ${error.message}`);
				return;
			}
			if (stderr) {
				console.error(`Execution error: ${stderr}`);
				return;
			}
			console.log(`Execution successful:\n${stdout}`);
		});
	}
});
